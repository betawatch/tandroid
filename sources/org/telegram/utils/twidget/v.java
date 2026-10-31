package org.telegram.utils.twidget;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import bi.v6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.ProfileActivity;
import rh.e6;
import th.e5;
import vh.n5;
import vh.o8;
import vh.u1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                try {
                    ((k0) obj).e(i11);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", d20.i(i11).n);
                ((z4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                ConnectionsManager.getInstance(((e6) obj).a).cancelRequest(i11, true);
                break;
            case 3:
                sg.f fVar = (sg.f) obj;
                if (fVar.b) {
                    q20 q20Var = fVar.d;
                    int i12 = 3;
                    if (q20Var != null) {
                        q20Var.a(Boolean.valueOf(i11 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i11 - 100);
                    org.telegram.messenger.i0.h3(new v(fVar, max, i12), max);
                    break;
                }
                break;
            case 4:
                e5 e5Var = (e5) obj;
                ArrayList arrayList = e5Var.g;
                e5Var.v(arrayList);
                v6 v6Var = e5Var.J;
                Collections.sort(arrayList, v6Var);
                ArrayList arrayList2 = e5Var.h;
                e5Var.v(arrayList2);
                Collections.sort(arrayList2, v6Var);
                zs.f(i11).k(zs.v5, new Object[0]);
                break;
            case 5:
                ((vh.m) obj).a(Integer.valueOf(i11));
                break;
            case 6:
                ((q20) obj).a(Integer.valueOf(i11));
                break;
            case 7:
                ((u1) obj).M0(i11);
                break;
            case 8:
                vp.r1(i11).V3((ArrayList) obj, true);
                break;
            case 9:
                o8 o8Var = (o8) obj;
                int i13 = o8Var.c;
                o8Var.l();
                o8Var.X1 = false;
                File file = o8Var.K1.O0;
                if (file != null) {
                    file.delete();
                    o8Var.K1.O0 = null;
                }
                o8Var.V(o8Var.K1, true);
                CharSequence[] charSequenceArr = {o8Var.c1.getText()};
                ArrayList W = vp.r1(i13).U4() ? ui.b0(i13).W(charSequenceArr, true, true) : new ArrayList();
                ArrayList W2 = vp.r1(i13).U4() ? ui.b0(i13).W(new CharSequence[]{o8Var.K1.C0}, true, true) : new ArrayList();
                n5 n5Var = o8Var.K1;
                n5Var.k = (TextUtils.equals(n5Var.C0, charSequenceArr[0]) && ui.K(W, W2)) ? false : true;
                o8Var.K1.C0 = new SpannableString(o8Var.c1.getText());
                o8Var.y();
                o8Var.x();
                n5 n5Var2 = o8Var.K1;
                o8Var.O1 = (n5Var2 == null || !n5Var2.K) ? 0 : 1;
                o8Var.K1 = (n5) o8Var.H1.get(i11);
                o8Var.N(0, 1);
                o8Var.M(0, 1);
                o8Var.d1.b.f3.O(false);
                o8Var.c1.setText(o8Var.K1.C0);
                break;
            case 10:
                ((zf.z) obj).g(i11);
                break;
            default:
                s4.f0 f0Var = (s4.f0) obj;
                f0Var.getClass();
                try {
                    f0Var.a.scrollBy(0, i11);
                    break;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
        }
    }

    public /* synthetic */ v(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
