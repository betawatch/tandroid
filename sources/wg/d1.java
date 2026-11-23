package wg;

import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.sg0;
import org.telegram.ui.v00;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements rj0, tj0 {
    public final /* synthetic */ e1 a;

    public /* synthetic */ d1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        e1 e1Var = this.a;
        ah.a aVar = e1Var.Z1;
        sg0 sg0Var = e1Var.V1;
        HashSet hashSet = e1Var.c2;
        if (view instanceof n8) {
            v00 v00Var = e1Var.s2;
            if (v00Var != null) {
                v00Var.run();
                e1Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.id : -chat.id;
            boolean z10 = false;
            if (hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j3));
                r10 r10Var = e1Var.u2;
                if (r10Var != null) {
                    op opVar = e1Var.Y1;
                    if (opVar != null && opVar.a.q) {
                        z10 = true;
                    }
                    r10Var.a(Boolean.valueOf(z10), hashSet);
                    e1Var.u2 = null;
                }
                e1Var.dismiss();
                return;
            }
            boolean z11 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                e1Var.i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == e1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                e1Var.j1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z12 = !isEmpty;
            if (z11 != z12) {
                aVar.setVisibility(0);
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(nr.h).setDuration(320L).withEndAction(isEmpty ? new x0(e1Var, 1) : null).start();
                xg.h hVar = e1Var.k2;
                boolean z13 = !z12;
                if (hVar.E != z13) {
                    hVar.E = z13;
                    org.telegram.messenger.g0.d0(hVar.f, new xg.f(z13));
                }
            }
            e1Var.e1();
            sg0Var.b(true, hashSet, new x0(e1Var, 2), null);
            e1Var.m1(true, true);
            e1Var.f1();
        }
    }

    public /* synthetic */ d1(e1 e1Var, fi.h0 h0Var, int i7) {
        this.a = e1Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean f(float f10, float f11, int i7, View view) {
        e1 e1Var = this.a;
        ah.a aVar = e1Var.Z1;
        HashSet hashSet = e1Var.c2;
        if (!(view instanceof ah.r)) {
            return false;
        }
        ah.r rVar = (ah.r) view;
        TLRPC.User user = rVar.getUser();
        long j3 = user != null ? user.id : -rVar.getChat().id;
        boolean z10 = !hashSet.isEmpty();
        if (hashSet.contains(Long.valueOf(j3))) {
            hashSet.remove(Long.valueOf(j3));
        } else {
            hashSet.add(Long.valueOf(j3));
            e1Var.i2.put(Long.valueOf(j3), user);
        }
        if (hashSet.size() == e1Var.h1() + 1) {
            hashSet.remove(Long.valueOf(j3));
            e1Var.j1();
            return true;
        }
        boolean isEmpty = hashSet.isEmpty();
        boolean z11 = !isEmpty;
        if (z10 != z11) {
            aVar.setVisibility(0);
            aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(nr.h).setDuration(320L).withEndAction(isEmpty ? new x0(e1Var, 7) : null).start();
            xg.h hVar = e1Var.k2;
            boolean z12 = !z11;
            if (hVar.E != z12) {
                hVar.E = z12;
                org.telegram.messenger.g0.d0(hVar.f, new xg.f(z12));
            }
        }
        e1Var.e1();
        e1Var.V1.b(true, hashSet, new x0(e1Var, 8), null);
        e1Var.m1(true, true);
        e1Var.f1();
        return true;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
