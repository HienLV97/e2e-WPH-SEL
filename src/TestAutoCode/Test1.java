package TestAutoCode;


//import ObjectLoginPage.Object;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;

import static Support.Routers.BaseURL;
import static org.testng.Assert.assertTrue;

//
public class Test1 extends Init {
    @Test
    public void justTest() throws IOException {
        String[] URL1 = {
                "https://writersperhour.com/essay-writers",
                "https://writersperhour.com/ib-writers",
                "https://writersperhour.com/how-it-works",
                "https://writersperhour.com/prices-and-discounts",
                "https://writersperhour.com/samples",
                "https://writersperhour.com/faq",
                "https://writersperhour.com/contacts",
                "https://writersperhour.com/about",
                "https://writersperhour.com/signin",
                "https://writersperhour.com/order",
                "https://writersperhour.com/signup",
                "https://writersperhour.com/buy-college-papers",
                "https://writersperhour.com/phd-papers",
                "https://writersperhour.com/order?promocode=paper15",
                "https://writersperhour.com/paper-editing-service",
                "https://writersperhour.com/tok_essay",
                "https://writersperhour.com/write-my-paper",
                "https://writersperhour.com/write-my-thesis",
                "https://writersperhour.com/analysis-papers",
                "https://writersperhour.com/biology-papers",
                "https://writersperhour.com/ib-internal-assessment",
                "https://writersperhour.com/buy-personal-statement",
                "https://writersperhour.com/write-my-speech",
                "https://writersperhour.com/buy-research-proposal",
                "https://writersperhour.com/write-my-assignment",
                "https://writersperhour.com/write-my-book-report",
                "https://writersperhour.com/do-my-powerpoint",
                "https://writersperhour.com/write-my-lab-report",
                "https://writersperhour.com/buy-capstone-project",
                "https://writersperhour.com/buy-coursework",
                "https://writersperhour.com/do-my-research-paper",
                "https://writersperhour.com/write-my-discussion-post-for-me",
                "https://writersperhour.com/write-my-annotated-bibliography",
                "https://writersperhour.com/argumentative-essay-writer",
                "https://writersperhour.com/dissertation-writer",
                "https://writersperhour.com/pay-to-do-term-paper",
                "https://writersperhour.com/extended-essay-writer",
                "https://writersperhour.com/fast-essay-writer",
                "https://writersperhour.com/write-my-literature-review",
                "https://writersperhour.com/write-my-essay-please",
                "https://writersperhour.com/homework-writers",
                "https://writersperhour.com/business-plan-writers",
                "https://writersperhour.com/creative-writers",
                "https://writersperhour.com/samples/math-sl-ia?ext=pdf",
                "https://writersperhour.com/samples/research-paper-psychology-apa?ext=pdf",
                "https://writersperhour.com/samples/mba-application-essay?ext=pdf",
                "https://writersperhour.com/samples/anthropology-essay-apa?ext=pdf",
                "https://writersperhour.com/blog/**",
                "https://writersperhour.com/blog/category/writing-advice",
                "https://writersperhour.com/blog/category/writing-inspiration",
                "https://writersperhour.com/blog/category/student-life",
                "https://writersperhour.com/blog/category/internships-careers",
                "https://writersperhour.com/blog/author/abelin",
                "https://writersperhour.com/blog/stress-management-tips-for-students",
                "https://writersperhour.com/blog/what-is-capstone-project-in-graduate-school",
                "https://writersperhour.com/blog/how-to-increase-your-typing-speed",
                "https://writersperhour.com/blog/how-to-write-a-dissertation-defense",
                "https://writersperhour.com/blog/term-paper-vs-research-paper",
                "https://writersperhour.com/blog/author/stefani-holloway",
                "https://writersperhour.com/blog/how-to-write-care-plan-for-nursing-school",
                "https://writersperhour.com/blog/how-to-write-500-word-essay-for-scholarships",
                "https://writersperhour.com/blog/tips-to-choose-strong-analysis-paper-topics",
                "https://writersperhour.com/blog/how-to-write-tok-essay",
                "https://writersperhour.com/blog/resume-writing-tips-for-college-freshers",
                "https://writersperhour.com/write-for-us",
                "https://writersperhour.com/password/request",
                "https://writersperhour.com/samples/may-2023-tok-essay-sample?ext=pdf",
                "https://writersperhour.com/blog/extended-essay-topics-for-ib",
                "https://writersperhour.com/samples/microeconomic-ia-sample?ext=pdf",
                "https://writersperhour.com/samples/ib-math-ia-example?ext=pdf",
                "https://writersperhour.com/samples/research-paper-gun-control?ext=pdf",
                "https://writersperhour.com/samples/research-paper-chicago-format?ext=pdf",
                "https://writersperhour.com/samples/criminal-law-essay-sample?ext=pdf",
                "https://writersperhour.com/samples/phd-research-proposal?ext=pdf",
                "https://writersperhour.com/samples/research-proposal-doctoral-mla?ext=pdf",
                "https://writersperhour.com/samples/personal-statement-medicine?ext=pdf",
                "https://writersperhour.com/samples/graduation-speech?ext=pdf",
                "https://writersperhour.com/samples/graduation-speech-high-school?ext=pdf",
                "https://writersperhour.com/samples/discussion-post-example?ext=pdf",
                "https://writersperhour.com/samples/discussion-post-apa?ext=pdf",
                "https://writersperhour.com/samples/lab-report-physics?ext=pdf",
                "https://writersperhour.com/samples/lab-report-biology?ext=pdf",
                "https://writersperhour.com/samples/statistics-lab-report?ext=pdf",
                "https://writersperhour.com/samples/chemistry-lab-report-example?ext=pdf",
                "https://writersperhour.com/samples/lesson-plan-sample?ext=pdf",
                "https://writersperhour.com/samples/nursing-care-plan-sample?ext=pdf",
                "https://writersperhour.com/samples/epq-sample?ext=pdf",
                "https://writersperhour.com/samples/epq-presentation-sample?ext=pdf",
                "https://writersperhour.com/samples/question-answer-example?ext=pdf",
                "https://writersperhour.com/samples/ib-ia-history-sample?ext=pdf",
                "https://writersperhour.com/samples/ib-extended-essay-sample?ext=pdf",
                "https://writersperhour.com/samples/tok-exhibition-ib-level?ext=pdf",
                "https://writersperhour.com/blog/best-practices-for-writing-college-summary",
                "https://writersperhour.com/blog/how-to-fluff-an-essay",
                "https://writersperhour.com/blog/good-ways-to-start-a-conclusion-sentence",
                "https://writersperhour.com/blog/tok-exhibition-objects-ideas-to-consider",
                "https://writersperhour.com/blog/creative-college-powerpoint-presentation-topics",
                "https://writersperhour.com/blog/how-to-write-conclusion-for-an-essay",
                "https://writersperhour.com/blog/how-to-prepare-for-ib",
                "https://writersperhour.com/blog/best-notetaking-apps-for-college-students",
                "https://writersperhour.com/blog/tips-to-get-along-with-your-roommate",
                "https://writersperhour.com/blog/reading-exercises-for-high-school-students",
                "https://writersperhour.com/blog/best-websites-college-students-should-know-for-writing-essays",
                "https://writersperhour.com/blog/how-to-take-good-lecture-notes",
                "https://writersperhour.com/blog/how-to-write-a-good-professional-summary-for-a-resume",
                "https://writersperhour.com/blog/how-to-write-a-professional-email-asking-for-an-internship",
                "https://writersperhour.com/blog/best-online-jobs-for-students",
                "https://writersperhour.com/blog/how-to-write-a-resume-for-a-college-internship",
                "https://writersperhour.com/blog/how-to-request-for-a-letter-of-recommendation-from-your-professor",
                "https://writersperhour.com/blog/essay-writing-hacks-to-write-high-scoring-essays",
                "https://writersperhour.com/order?promocode=first15",
                "https://writersperhour.com/blog/writing-strategies-for-esl-students",
                "https://writersperhour.com/blog/where-to-find-relevant-sources-for-your-research-paper",
                "https://writersperhour.com/blog/how-to-write-a-1000-word-essay-in-one-night",
                "https://writersperhour.com/blog/how-to-edit-college-essay-fast",
                "https://writersperhour.com/blog/write-10000-word-undergraduate-dissertation-in-16-days",
                "https://writersperhour.com/blog/how-to-write-strong-conclusion-paragraph-argumentative-essay",
                "https://writersperhour.com/blog/how-to-write-an-appendix-for-a-research-paper",
                "https://writersperhour.com/blog/65-essay-topics-for-high-school-students",
                "https://writersperhour.com/blog/how-to-make-an-essay-longer-than-it-really-is",
                "https://writersperhour.com/blog/how-do-you-write-a-good-thesis-statement",
                "https://writersperhour.com/blog/how-to-write-a-cuegis-essay",
                "https://writersperhour.com/blog/how-to-use-figurative-language-for-essays",
                "https://writersperhour.com/blog/spatial-order-organization-what-is-it-and-how-to-use-it-in-essay-writing",
                "https://writersperhour.com/blog/essay-hooks",
                "https://writersperhour.com/blog/how-to-conduct-secondary-research-for-your-essay",
                "https://writersperhour.com/blog/college-student-guide-to-improve-creative-writing-skills",
                "https://writersperhour.com/blog/how-to-write-an-executive-summary-for-an-essay",
                "https://writersperhour.com/blog/what-is-dbq-essay",
                "https://writersperhour.com/blog/how-to-write-a-book-critique",
                "https://writersperhour.com/blog/leadership-essay",
                "https://writersperhour.com/blog/steps-of-writing-an-essay",
                "https://writersperhour.com/blog/how-to-write-interesting-essays",
                "https://writersperhour.com/blog/best-persuasive-essay-topics-to-get-you-inspired",
                "https://writersperhour.com/blog/how-to-write-college-research-paper-outline",
                "https://writersperhour.com/blog/how-significant-are-opposing-points-of-view-in-an-argument",
                "https://writersperhour.com/blog/strong-transition-words-for-essays",
                "https://writersperhour.com/blog/rebuttal-in-argumentative-essay",
                "https://writersperhour.com/blog/how-to-write-a-hook-for-an-argumentative-essay",
                "https://writersperhour.com/blog/argumentative-essay-dos-and-donts",
                "https://writersperhour.com/blog/how-analyze-ethical-considerations-marketing-practices",
                "https://writersperhour.com/blog/how-to-type-an-email-to-professor",
                "https://writersperhour.com/blog/how-to-start-commemorative-speech",
                "https://writersperhour.com/blog/how-to-write-a-tok-exhibition-essay",
                "https://writersperhour.com/blog/how-to-choose-a-chemistry-ia-topic-for-ib-standard-level",
                "https://writersperhour.com/blog/20-math-internal-assessment-topic-ideas-for-ib-standard-level",
                "https://writersperhour.com/blog/history-internal-assessment-topic-ideas-for-ib-students",
                "https://writersperhour.com/blog/how-to-write-coursework-quickly",
                "https://writersperhour.com/blog/how-to-write-a-reverse-outline",
                "https://writersperhour.com/blog/useful-college-essay-writing-tips-for-stellar-paper",
                "https://writersperhour.com/blog/how-to-revise-an-essay-in-college",
                "https://writersperhour.com/blog/how-to-write-an-essay-introduction",
                "https://writersperhour.com/blog/how-to-write-a-cause-and-effect-essay-for-college",
                "https://writersperhour.com/blog/how-to-write-an-essay-outline",
                "https://writersperhour.com/blog/creative-graduation-speech-ideas-standing-ovation",
                "https://writersperhour.com/blog/how-to-create-an-essay-title",
                "https://writersperhour.com/blog/tips-for-writing-synthesis-essay",
                "https://writersperhour.com/blog/good-argumentative-essay-topics",
                "https://writersperhour.com/blog/top-notch-mba-research-topic-examples-to-qrite-paper",
                "https://writersperhour.com/blog/how-write-movie-review-college",
                "https://writersperhour.com/blog/college-student-guide-to-writing-about-theology-and-religion",
                "https://writersperhour.com/blog/20-biology-internal-assessment-topic-ideas-for-ib-standard-level",
                "https://writersperhour.com/blog/how-to-write-and-format-mba-essay-that-gets-noticed",
                "https://writersperhour.com/blog/author/moss-clement",
                "https://writersperhour.com/blog/10-tips-student-must-apply-to-write-an-engaging-essay",
                "https://writersperhour.com/blog/how-to-write-a-shakespeare-essay",
                "https://writersperhour.com/blog/tips-writing-last-minute-essay-for-college",
                "https://writersperhour.com/blog/how-to-write-a-college-essay",
                "https://writersperhour.com/blog/what-to-pack-for-college-freshman-year",
                "https://writersperhour.com/blog/mental-health-tips-for-college-students",
                "https://writersperhour.com/blog/how-to-write-an-analytical-essay-on-a-book",
                "https://writersperhour.com/blog/6-surefire-ways-to-avoid-plagiarism-in-essays",
                "https://writersperhour.com/blog/how-to-manage-negative-feedback-for-your-college-essay",
                "https://writersperhour.com/blog/how-to-motivate-yourself-to-write-a-college-essay",
                "https://writersperhour.com/blog/essential-study-tips-for-academic-success",
                "https://writersperhour.com/blog/scholarship-application-essay-tips-that-will-get-you-accepted",
                "https://writersperhour.com/blog/how-to-write-an-essay-paper",
                "https://writersperhour.com/blog/what-include-in-an-activities-resume-for-college-admissions",
                "https://writersperhour.com/blog/guide-to-writing-the-perfect-cv-for-your-masters-application",
                "https://writersperhour.com/blog/6-mistakes-that-will-ruin-your-personal-statement-for-grad-school",
                "https://writersperhour.com/blog/how-to-choose-right-elearning-course",
                "https://writersperhour.com/blog/what-is-a-prompt-in-writing-an-essay",
                "https://writersperhour.com/blog/personal-narrative-ideas-for-high-school",
                "https://writersperhour.com/blog/how-to-write-introduction-for-argumentative-essay",
                "https://writersperhour.com/blog/what-is-signposting-in-an-essay",
                "https://writersperhour.com/blog/how-to-use-rhetorical-questions-in-an-essay",
                "https://writersperhour.com/blog/how-do-you-write-an-interview-paper",
                "https://writersperhour.com/blog/12-common-college-essay-mistakes-you-should-avoid",
                "https://writersperhour.com/blog/complete-guide-to-writing-a-reflective-essay-for-university",
                "https://writersperhour.com/blog/what-is-formal-academic-writing",
                "https://writersperhour.com/blog/how-do-you-write-a-character-analysis",
                "https://writersperhour.com/blog/how-to-analyze-a-short-story-step-by-step",
                "https://writersperhour.com/blog/when-is-paraphrasing-plagiarism",
                "https://writersperhour.com/blog/how-to-outline-literature-review",
                "https://writersperhour.com/blog/how-to-write-extended-project-qualification-essay",
                "https://writersperhour.com/blog/how-to-write-a-good-lesson-plan",
                "https://writersperhour.com/blog/can-you-get-in-trouble-for-plagiarizing-yourself",
                "https://writersperhour.com/blog/elements-of-good-research-proposal",
                "https://writersperhour.com/blog/how-to-write-strong-discussion-post",
                "https://writersperhour.com/blog/7-tips-write-research-paper-which-is-due-tomorrow",
                "https://writersperhour.com/blog/6-tips-how-to-write-personal-statement-mba",
                "https://writersperhour.com/blog/complete-essay-checklist-for-students",
                "https://writersperhour.com/blog/active-voice-vs-passive-voice-in-essay-writing",
                "https://writersperhour.com/blog/chemistry-ia-checklist-to-consider-for-acing-your-paper",
                "https://writersperhour.com/blog/how-to-start-a-book-review-essay",
                "https://writersperhour.com/blog/professor-found-that-i-paid-someone-to-write-my-essay",
                "https://writersperhour.com/blog/how-to-write-a-reaction-paper-on-an-article",
                "https://writersperhour.com/blog/psychology-research-paper-writing-guide-you-need",
                "https://writersperhour.com/blog/how-college-students-can-use-literary-devices-to-improve-their-essay-writing",
                "https://writersperhour.com/blog/how-to-write-a-case-study-paper-in-apa-format",
                "https://writersperhour.com/blog/writing-letter-of-intent-for-college",
                "https://writersperhour.com/blog/how-to-write-a-college-reflection-paper",
                "https://writersperhour.com/blog/what-is-explanatory-essay-and-how-to-get-started",
                "https://writersperhour.com/blog/how-to-write-a-5-paragraph-compare-and-contrast-essay",
                "https://writersperhour.com/blog/how-to-write-lab-report-introduction",
                "https://writersperhour.com/blog/tips-how-to-write-ib-extended-essay",
                "https://writersperhour.com/blog/steps-writing-rhetorical-analysis-essay-effectively"

        };
        for (int i = 0; i < URL1.length; i++) {
            String url = URL1[i];
            driver.get(url);
            int responseCode = ((HttpURLConnection) new URL(url).openConnection()).getResponseCode();
//            System.out.println(url);
            if (responseCode != 404) {
                WebElement errorMes = null;
                try {
                    errorMes = driver.findElement(By.xpath("//p[contains(text(),\"Oops, the page you were looking for doesn't exist\")]"));
                } catch (org.openqa.selenium.NoSuchElementException e) {
                }
                if (errorMes != null) {
                    System.out.println("URL bị lỗi 404 mới");
                    System.out.println(url);
                }
            }
//            else {
//                System.out.println("URL bị lỗi 404 cũ");
//                System.out.println(url);
//            }
        }
//        driver.navigate().to(URL);
    }
}

