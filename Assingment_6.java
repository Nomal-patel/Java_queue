public class Assingment_6 {


    //print job class stores data of a Job
    public static class PrintJob{
        int pageId;
        int page;

        public PrintJob(int pageId,int page){
            this.page = page;
            this.pageId = pageId;

        }

        public int getPage(){return page;}

        public int getPageId(){return pageId;}

    }

    public static class Node {
        PrintJob P;
        Node next;
        Node previous;

        public Node(){
            P = null;
            next = null;
            previous = null;

        }

        public PrintJob getP(){return P;}
        public Node getNext(){return next;}

        public void setP(PrintJob P) { this.P = P; }
        public void setPrevious(Node previous) { this.previous = previous; }







    }

    public static class PrintQueue {
        Node head;
        Node tail;

        int count;

        public PrintQueue() {
            head = null;
            tail = null;
            count = 0;
        }


        //pushes a node at the back of the queue

        public void push(PrintJob newJob) {
            Node new_node = new Node();
            new_node.setP(newJob);
            new_node.next = null;
            if (tail == null) {
                head = new_node;

            }
            else {
                tail.next = new_node;
            }
            tail = new_node;
            count++;
        }

        //removes a node from the front of Printjob Queue
        PrintJob pop(){
            PrintJob job =  new Assingment_6.PrintJob(0,0);

            if(head == null){
                System.out.println("Queue is empty");
            }
            else {
                job= head.getP();

                if(head.getNext()==null){
                    head = null;
                }
                else {
                    head = head.getNext();
                    head.setPrevious(null);
                }
                System.out.println("The ID for the job is: " + job.getPageId() + "\nPRINTED " + job.getPage() + " PAGES");

            }

            return job;
        }



    }











}
