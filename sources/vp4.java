// default package

import android.text.TextUtils;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vp4 implements ve3 {
    public final b6 a;
    public final v95 b;

    public vp4(b6 b6Var, GroupCallMessage groupCallMessage) {
        v95 v95Var = new v95(b6Var.getContext());
        this.b = v95Var;
        v95Var.setBackgroundColor(vm2.o(-16777216, 34));
        tpa tpaVar = v95Var.w;
        tpaVar.setMaxLines(1);
        tpaVar.setSingleLine(true);
        tpaVar.setEllipsize(TextUtils.TruncateAt.END);
        v95Var.set(groupCallMessage);
        v95Var.setAlpha(0.0f);
        this.a = b6Var;
        b6Var.addView(v95Var);
    }

    @Override // ve3
    public final void a() {
        this.a.removeView(this.b);
    }
}
