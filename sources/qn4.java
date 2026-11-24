// default package

import android.text.TextUtils;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qn4 implements be3 {
    public final a6 a;
    public final t75 b;

    public qn4(a6 a6Var, GroupCallMessage groupCallMessage) {
        t75 t75Var = new t75(a6Var.getContext());
        this.b = t75Var;
        t75Var.setBackgroundColor(bm2.o(-16777216, 34));
        wla wlaVar = t75Var.w;
        wlaVar.setMaxLines(1);
        wlaVar.setSingleLine(true);
        wlaVar.setEllipsize(TextUtils.TruncateAt.END);
        t75Var.set(groupCallMessage);
        t75Var.setAlpha(0.0f);
        this.a = a6Var;
        a6Var.addView(t75Var);
    }

    @Override // be3
    public final void a() {
        this.a.removeView(this.b);
    }
}
