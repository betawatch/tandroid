// default package

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r71 extends j71 {
    public gd4 n;
    public final ArrayList r;
    public zm2 s;
    public final /* synthetic */ w71 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r71(w71 w71Var) {
        super(w71Var, 1);
        this.w = w71Var;
        this.r = new ArrayList();
    }

    @Override // j71, i71
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return;
            }
            arrayList.add(new no6(0, ((p71) arrayList2.get(i)).d.a.getPath(), 0, ((p71) arrayList2.get(i)).d.d == 1, 0, 0));
            i++;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (this.s == null) {
            zm2 zm2Var = new zm2(new ColorDrawable(aob.w0(null, aob.X9, false)), aob.R4);
            this.s = zm2Var;
            zm2Var.x = true;
        }
        jja jjaVar = (jja) f89Var.a;
        c71 c71Var = ((p71) this.e.get(i)).d;
        Object tag = jjaVar.getTag();
        ImageReceiver imageReceiver = jjaVar.c;
        boolean z = c71Var == tag;
        jjaVar.setTag(c71Var);
        int max = (int) Math.max(100.0f, hl.b1().x / hl.p);
        byte b = c71Var.d;
        File file = c71Var.a;
        if (b == 1) {
            imageReceiver.d0(jn5.g("vthumb://0:" + file.getAbsolutePath()), qd4.m(max, max, "_"), this.s, null, null, 0);
            jjaVar.m(hl.i0(c71Var.c, false, false), true);
        } else {
            imageReceiver.d0(jn5.g("thumb://0:" + file.getAbsolutePath()), qd4.m(max, max, "_"), this.s, null, null, 0);
            jjaVar.m(hl.i0(c71Var.c, false, false), false);
        }
        jjaVar.i(this.w.h.j.contains(c71Var), z);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        if (this.n == null) {
            this.n = new gd4(viewGroup.getContext(), null);
        }
        q71 q71Var = new q71(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        q71Var.setStyle(1);
        return new n69(q71Var);
    }
}
