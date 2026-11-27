// default package

import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rbc implements s69, u69 {
    public final /* synthetic */ sbc a;

    public /* synthetic */ rbc(sbc sbcVar) {
        this.a = sbcVar;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        long j;
        sbc sbcVar = this.a;
        dr0 dr0Var = sbcVar.Y1;
        mi7 mi7Var = sbcVar.U1;
        HashSet hashSet = sbcVar.b2;
        if (view instanceof skb) {
            z55 z55Var = sbcVar.r2;
            if (z55Var != null) {
                z55Var.run();
                sbcVar.dismiss();
                return;
            }
            return;
        }
        if (view instanceof e3a) {
            e3a e3aVar = (e3a) view;
            TLRPC.User user = e3aVar.getUser();
            TLRPC.Chat chat = e3aVar.getChat();
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
                icc iccVar = sbcVar.t2;
                if (iccVar != null) {
                    og2 og2Var = sbcVar.X1;
                    if (og2Var != null && og2Var.a.q) {
                        z = true;
                    }
                    iccVar.a(Boolean.valueOf(z), hashSet);
                    sbcVar.t2 = null;
                }
                sbcVar.dismiss();
                return;
            }
            boolean z2 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                sbcVar.h2.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == sbcVar.c1() + 1) {
                hashSet.remove(Long.valueOf(j));
                sbcVar.e1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z3 = !isEmpty;
            if (z2 != z3) {
                dr0Var.setVisibility(0);
                dr0Var.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? hl.L(12.0f) : 0.0f).setInterpolator(k43.h).setDuration(320L).withEndAction(isEmpty ? new mbc(sbcVar, b) : null).start();
                n2a n2aVar = sbcVar.j2;
                boolean z4 = !z3;
                if (n2aVar.E != z4) {
                    n2aVar.E = z4;
                    hl.d0(n2aVar.f, new l2a(z4));
                }
            }
            sbcVar.Z0();
            mi7Var.b(true, hashSet, new mbc(sbcVar, (byte) 2), null);
            sbcVar.h1(true, true);
            sbcVar.a1();
        }
    }

    public /* synthetic */ rbc(sbc sbcVar, w53 w53Var, int i) {
        this.a = sbcVar;
    }

    @Override // u69
    public final void f() {
    }

    @Override // u69
    public final void h(float f) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }

    @Override // u69
    public final boolean d(float f, float f2, int i, View view) {
        sbc sbcVar = this.a;
        dr0 dr0Var = sbcVar.Y1;
        HashSet hashSet = sbcVar.b2;
        if (!(view instanceof e3a)) {
            return false;
        }
        e3a e3aVar = (e3a) view;
        TLRPC.User user = e3aVar.getUser();
        long j = user != null ? user.id : -e3aVar.getChat().id;
        boolean z = !hashSet.isEmpty();
        if (hashSet.contains(Long.valueOf(j))) {
            hashSet.remove(Long.valueOf(j));
        } else {
            hashSet.add(Long.valueOf(j));
            sbcVar.h2.put(Long.valueOf(j), user);
        }
        if (hashSet.size() == sbcVar.c1() + 1) {
            hashSet.remove(Long.valueOf(j));
            sbcVar.e1();
            return true;
        }
        boolean isEmpty = hashSet.isEmpty();
        boolean z2 = !isEmpty;
        if (z != z2) {
            dr0Var.setVisibility(0);
            dr0Var.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? hl.L(12.0f) : 0.0f).setInterpolator(k43.h).setDuration(320L).withEndAction(isEmpty ? new mbc(sbcVar, (byte) 6) : null).start();
            n2a n2aVar = sbcVar.j2;
            boolean z3 = !z2;
            if (n2aVar.E != z3) {
                n2aVar.E = z3;
                hl.d0(n2aVar.f, new l2a(z3));
            }
        }
        sbcVar.Z0();
        sbcVar.U1.b(true, hashSet, new mbc(sbcVar, (byte) 8), null);
        sbcVar.h1(true, true);
        sbcVar.a1();
        return true;
    }
}
