// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
