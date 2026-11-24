// default package

import android.content.Context;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yc6 extends fj2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc6(byte b, Context context, Object obj) {
        super(context);
        this.h = b;
        this.n = obj;
    }

    @Override // fj2
    public final void a() {
        byte b = this.h;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((ad6) obj).h(null);
                break;
            case 1:
                ((td6) obj).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (!passcodeActivity.F) {
                    postDelayed(new oq7(this, (byte) 4), 260L);
                    break;
                } else {
                    passcodeActivity.t0();
                    break;
                }
            default:
                ((p3c) obj).G0();
                break;
        }
    }
}
