package uh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.yi0;
import w7.q;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
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
        h hVar = (stack == null || stack.isEmpty()) ? new h() : (h) stack.remove(0);
        hVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f13 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                yi0 yi0Var = (yi0) arrayList.get(i10);
                if (f13 >= yi0Var.b && f13 <= yi0Var.c) {
                    hVar.y = true;
                    break;
                }
                i10++;
            }
        }
        hVar.n = -1.0f;
        ValueAnimator valueAnimator = hVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hVar.p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f;
        hVar.setBounds(max, i11, (int) Math.min(f11, i12 <= 0 ? 2.14748365E9f : i12), (int) f12);
        hVar.h(this.b.getPaint().getColor());
        hVar.t = pt.c;
        int width = hVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = h.B;
        int b10 = q.b(width * i13, i13, h.A);
        Stack stack2 = hVar.c;
        hVar.d = b10;
        while (hVar.h.size() + stack2.size() < b10) {
            stack2.push(new c());
        }
        View view = this.a;
        if (view != null) {
            hVar.i = view;
        }
        this.d.add(hVar);
    }
}
