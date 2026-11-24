// default package

import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s9c implements g59, i59 {
    public final /* synthetic */ t9c a;

    public /* synthetic */ s9c(t9c t9cVar) {
        this.a = t9cVar;
    }

    @Override // g59
    public final void d(float f, float f2, int i, View view) {
        long j;
        t9c t9cVar = this.a;
        ds0 ds0Var = t9cVar.Y1;
        gi7 gi7Var = t9cVar.U1;
        HashSet hashSet = t9cVar.b2;
        if (view instanceof xib) {
            v55 v55Var = t9cVar.r2;
            if (v55Var != null) {
                v55Var.run();
                t9cVar.dismiss();
                return;
            }
            return;
        }
        if (view instanceof m1a) {
            m1a m1aVar = (m1a) view;
            TLRPC.User user = m1aVar.getUser();
            TLRPC.Chat chat = m1aVar.getChat();
            if (user != null) {
                j = user.id;
            } else if (chat == null) {
                return;
            } else {
                j = -chat.id;
            }
            boolean z = false;
            byte b = 1;
            if (hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j));
                jac jacVar = t9cVar.t2;
                if (jacVar != null) {
                    jh2 jh2Var = t9cVar.X1;
                    if (jh2Var != null && jh2Var.a.q) {
                        z = true;
                    }
                    jacVar.a(Boolean.valueOf(z), hashSet);
                    t9cVar.t2 = null;
                }
                t9cVar.dismiss();
                return;
            }
            boolean z2 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                t9cVar.h2.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == t9cVar.b1() + 1) {
                hashSet.remove(Long.valueOf(j));
                t9cVar.d1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z3 = !isEmpty;
            if (z2 != z3) {
                ds0Var.setVisibility(0);
                ds0Var.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? gm.L(12.0f) : 0.0f).setInterpolator(d53.h).setDuration(320L).withEndAction(isEmpty ? new n9c(t9cVar, b) : null).start();
                v0a v0aVar = t9cVar.j2;
                boolean z4 = !z3;
                if (v0aVar.E != z4) {
                    v0aVar.E = z4;
                    gm.d0(v0aVar.f, new t0a(z4));
                }
            }
            t9cVar.Y0();
            gi7Var.b(true, hashSet, new n9c(t9cVar, (byte) 2), null);
            t9cVar.g1(true, true);
            t9cVar.Z0();
        }
    }

    @Override // g59
    public final boolean u(View view) {
        return false;
    }

    public /* synthetic */ s9c(t9c t9cVar, q63 q63Var, int i) {
        this.a = t9cVar;
    }

    @Override // i59
    public final void i() {
    }

    @Override // i59
    public final void k(float f) {
    }

    @Override // g59
    public final void p(View view, float f, float f2) {
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        t9c t9cVar = this.a;
        ds0 ds0Var = t9cVar.Y1;
        HashSet hashSet = t9cVar.b2;
        if (!(view instanceof m1a)) {
            return false;
        }
        m1a m1aVar = (m1a) view;
        TLRPC.User user = m1aVar.getUser();
        long j = user != null ? user.id : -m1aVar.getChat().id;
        boolean z = !hashSet.isEmpty();
        if (hashSet.contains(Long.valueOf(j))) {
            hashSet.remove(Long.valueOf(j));
        } else {
            hashSet.add(Long.valueOf(j));
            t9cVar.h2.put(Long.valueOf(j), user);
        }
        if (hashSet.size() == t9cVar.b1() + 1) {
            hashSet.remove(Long.valueOf(j));
            t9cVar.d1();
            return true;
        }
        boolean isEmpty = hashSet.isEmpty();
        boolean z2 = !isEmpty;
        if (z != z2) {
            ds0Var.setVisibility(0);
            ds0Var.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? gm.L(12.0f) : 0.0f).setInterpolator(d53.h).setDuration(320L).withEndAction(isEmpty ? new n9c(t9cVar, (byte) 7) : null).start();
            v0a v0aVar = t9cVar.j2;
            boolean z3 = !z2;
            if (v0aVar.E != z3) {
                v0aVar.E = z3;
                gm.d0(v0aVar.f, new t0a(z3));
            }
        }
        t9cVar.Y0();
        t9cVar.U1.b(true, hashSet, new n9c(t9cVar, (byte) 8), null);
        t9cVar.g1(true, true);
        t9cVar.Z0();
        return true;
    }
}
