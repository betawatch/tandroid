// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xh3 extends ey8 {
    public final /* synthetic */ byte f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh3(tzb tzbVar, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = tzbVar;
    }

    @Override // ey8
    public final float d() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return ((tj3) obj).a.getViewOffset();
            default:
                return ((tzb) obj).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh3(String str, String str2, tj3 tj3Var) {
        super(str, str2);
        this.g0 = tj3Var;
    }
}
