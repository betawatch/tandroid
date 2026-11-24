// default package

import android.content.SharedPreferences;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ rm1(boolean[] zArr, byte b) {
        this.a = b;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                break;
            case 1:
                gn3[] gn3VarArr = DictationAsr.a;
                zArr[0] = true;
                break;
            case 2:
                gn3[] gn3VarArr2 = DictationAsr.a;
                zArr[0] = true;
                break;
            case 3:
                zArr[0] = true;
                break;
            case 4:
                zArr[0] = true;
                break;
            case 5:
                zArr[0] = true;
                break;
            case 6:
                zArr[0] = true;
                break;
            case 7:
                if (!zArr[0]) {
                    SharedPreferences d1 = oc7.d1();
                    d1.edit().putInt("showchattagsinfo", d1.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                zArr[0] = true;
                break;
        }
    }
}
