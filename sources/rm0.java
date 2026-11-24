// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpannableStringBuilder b;

    public /* synthetic */ rm0(SpannableStringBuilder spannableStringBuilder, byte b) {
        this.a = b;
        this.b = spannableStringBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (b) {
            case 0:
                u21 Y = u21.Y();
                if (Y != null) {
                    Y.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    break;
                }
                break;
            default:
                m21 I = vp7.h().I(R.raw.contact_check, k96.M0(2131749566, null), spannableStringBuilder);
                I.t = true;
                I.j();
                break;
        }
    }
}
