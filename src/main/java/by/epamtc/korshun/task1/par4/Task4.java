package by.epamtc.korshun.task1.par4;

import by.epamtc.korshun.task1.tool.ScanValue;

import java.io.Serializable;
import java.util.Random;


class Numbers implements Serializable {
        private int A, B, C, D;
        Numbers() {
            Random random = new Random(100);
            A =random.nextInt(100) ;
            B = random.nextInt(100) ;
            C = random.nextInt(100) ;
            D = random.nextInt(100) ;
        }

        Numbers(int A,int B, int C, int D){
            this.A=A;
            this.B=B;
            this.C=C;
            this.D=D;
        }

        public  int conditionalChecker(){
            int count = 0 ;
            int[]array = new int[]{getA(),getB(),getC(),getD()};
            for (int i =0;i<array.length;i++){
                if(array[i]%2==0)
                    count++;
            }
            return count;
        }

        public static boolean verification(int checker){
            if(checker>=2)
                return true;
            return false;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Numbers numbers = (Numbers) o;
            return A == numbers.A && B == numbers.B && C == numbers.C && D == numbers.D;
        }

        @Override
        public int hashCode() {
            return 23*A*B*C*D;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName()+
                    "  is {A=" + getA() +
                    ", B=" + getB() +
                    ", C=" + getC() +
                    ", D=" + getD()+'}';
        }

        public int getA() {
            return A;
        }

        public void setA(int A) {
            this.A = A;
        }

        public int getB() {
            return B;
        }

        public void setB(int B) {
            this.B = B;
        }

        public int getC() {
            return C;
        }

        public void setC(int C) {
            this.C = C;
        }

        public int getD() {
            return D;
        }

        public void setD(int D) {
            this.D = D;
        }

    }
