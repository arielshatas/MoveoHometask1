import org.junit.Assert;
import org.junit.Test;

public class Moveotests {

    @Test//בדיקת סניטי שבודקת כניבה לעמוד בראים וכניסה לעמוד קריירה ומוודא שאנחנו נמצאים בעמוד הנכון
    public void openSite(){
        Moveo moveo1=new Moveo();//פתיחת העאתר ובדיקה שאנחנו באתר הנכון
        String expectedurl ="https://www.moveo.group/";
        String actualurl = moveo1.openSite(expectedurl);
        Assert.assertEquals(actualurl,expectedurl);
        System.out.println("smoke test---->pass");



        String actualBoostyorcareerLable = moveo1.OpenCareerPage();//בדיקה שאנחנו בעמוד הקרירה
        String expectedBoostyorcareerLa="We are Moveo";
        Assert.assertEquals(actualBoostyorcareerLable,expectedBoostyorcareerLa);
        System.out.println("smoke test---->pass");
    }



    @Test//apply here
    public void ApplyToMoveo(){
        Moveo moveo2=new Moveo();//פתיחת האתר ובדיקה שאנחנו באתר הנכון
        String expectedurl ="https://www.moveo.group/";
        String actualurl = moveo2.openSite(expectedurl);
        Assert.assertEquals(actualurl,expectedurl);
        System.out.println("smoke test---->pass");



        String actualBoostyorcareerLable = moveo2.OpenCareerPage();//בדיקה שאנחנו בעמוד הקרירה
        String expectedBoostyorcareerLa="We are Moveo";
        Assert.assertEquals(actualBoostyorcareerLable,expectedBoostyorcareerLa);
        System.out.println("smoke test---->pass");


        String Actualapllication = moveo2.ApllyToWork();// הassert הזה היה אמור לאשר לי את הטסט שבאמת השארתי פרטים כראוי אך לצערי לא הצלחתי
        String Expectedresult="";
        Assert.assertEquals(Actualapllication,Expectedresult);
        System.out.println("smoke test---->pass");


    }


}