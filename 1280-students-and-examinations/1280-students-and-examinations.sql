# Write your MySQL query statement below
select S.student_id, S.student_name, Sb.subject_name, count(E.student_id) as attended_exams from Students S join Subjects Sb left join Examinations E on S.student_id = E.student_id and Sb.subject_name = E.subject_name group by S.student_id, S.student_name, Sb.subject_name order by S.student_id, Sb.subject_name;