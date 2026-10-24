package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.st;
import w7.r;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class a extends Path {
    public final /* synthetic */ View a;
    public final /* synthetic */ Layout b;
    public final /* synthetic */ Stack c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.a = view;
        this.b = layout;
        this.c = stack;
        this.d = list;
        this.e = i10;
        this.f = i11;
        this.g = arrayList;
    }

    @Override // android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Stack stack = this.c;
        int i10 = 0;
        g gVar = (stack == null || stack.isEmpty()) ? new g() : (g) stack.remove(0);
        gVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f13 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                pj0 pj0Var = (pj0) arrayList.get(i10);
                if (f13 >= pj0Var.b && f13 <= pj0Var.c) {
                    gVar.y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.n = -1.0f;
        ValueAnimator valueAnimator = gVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f;
        gVar.setBounds(max, i11, (int) Math.min(f11, i12 <= 0 ? 2.14748365E9f : i12), (int) f12);
        gVar.h(this.b.getPaint().getColor());
        gVar.t = st.c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = r.b(width * i13, i13, g.A);
        Stack stack2 = gVar.c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new c());
        }
        View view = this.a;
        if (view != null) {
            gVar.i = view;
        }
        this.d.add(gVar);
    }
}
