package xh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import c8.j9;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.qg0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public a(View view, Layout layout, Stack stack, List list, int i7, int i10, ArrayList arrayList) {
        this.a = view;
        this.b = layout;
        this.c = stack;
        this.d = list;
        this.e = i7;
        this.f = i10;
        this.g = arrayList;
    }

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Stack stack = this.c;
        int i7 = 0;
        f fVar = (stack == null || stack.isEmpty()) ? new f() : (f) stack.remove(0);
        fVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f14 = (f11 + f13) / 2.0f;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                qg0 qg0Var = (qg0) arrayList.get(i7);
                if (f14 >= qg0Var.b && f14 <= qg0Var.c) {
                    fVar.y = true;
                    break;
                }
                i7++;
            }
        }
        fVar.n = -1.0f;
        ValueAnimator valueAnimator = fVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fVar.p = true;
        int max = (int) Math.max(f10, this.e);
        int i10 = (int) f11;
        int i11 = this.f;
        fVar.setBounds(max, i10, (int) Math.min(f12, i11 <= 0 ? 2.14748365E9f : i11), (int) f13);
        fVar.h(this.b.getPaint().getColor());
        fVar.t = ks.c;
        int width = fVar.getBounds().width() / g0.L(6.0f);
        int i12 = f.B;
        int b10 = j9.b(width * i12, i12, f.A);
        Stack stack2 = fVar.c;
        fVar.d = b10;
        while (fVar.h.size() + stack2.size() < b10) {
            stack2.push(new b());
        }
        View view = this.a;
        if (view != null) {
            fVar.i = view;
        }
        this.d.add(fVar);
    }
}
