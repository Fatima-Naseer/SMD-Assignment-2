package com.ahmad.cv.model;

public class demo {
        private String main_title;
        private String detail;

        public demo(String title, String det) {
            this.detail= det;
            this.main_title = title;
        }

        public void setData(String name, String x) {
            this.main_title= name;
            this.detail=x;
        }

        public String getData() {
            return main_title;
        }

        public String getDetail() {
            return detail;
        }
    }

