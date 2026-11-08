package org.telegram.utils.twidget;

import android.os.Process;
import android.text.TextUtils;
import bi.ra;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0 k0Var;
        switch (this.a) {
            case 0:
                k0 k0Var2 = (k0) this.b;
                k0Var2.getClass();
                n0.a(k0Var2);
                return;
            case 1:
                final m0 m0Var = (m0) this.b;
                int i7 = m0Var.a;
                Iterator it = n0.a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        k0Var = (k0) it.next();
                        if (k0Var.b != i7 || k0Var.l != m0Var.b || k0Var.k || k0Var.x <= 0 || k0Var.d <= 0) {
                        }
                    } else {
                        k0Var = null;
                    }
                }
                if (k0Var == null) {
                    n0.E();
                    return;
                }
                TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                tL_messages_getWidgetPublicData.peer = qp.s1(k0Var.b).j1(k0Var.c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.c;
                m0Var.e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new v10() { // from class: org.telegram.utils.twidget.h0
                    @Override // org.telegram.messenger.v10
                    public final void a(Object obj, Object obj2) {
                        TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                        m0 m0Var2 = m0.this;
                        m0Var2.e = 0;
                        HashMap hashMap = n0.l;
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = m0Var2.a;
                        sb2.append(i10);
                        sb2.append("/");
                        long j3 = m0Var2.b;
                        sb2.append(j3);
                        if (hashMap.get(sb2.toString()) != m0Var2) {
                            return;
                        }
                        if (messages_widgetpublicdata != null) {
                            int i11 = messages_widgetpublicdata.period;
                            m0Var2.d = i11 <= 0 ? 30 : Math.max(5, Math.min(3600, i11));
                            if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                                TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                                long j10 = tL_messages_widgetPublicData.hash;
                                m0Var2.c = j10;
                                String str = tL_messages_widgetPublicData.data;
                                String C = n0.C(str);
                                for (k0 k0Var3 : n0.a.values()) {
                                    if (k0Var3.b == i10 && k0Var3.l == j3 && !k0Var3.k && (!TextUtils.equals(k0Var3.p, C) || k0Var3.q != j10)) {
                                        k0Var3.q = j10;
                                        n0.c(k0Var3, k0Var3.o, C);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var3.r;
                                        if (tL_messageMediaWidget != null) {
                                            tL_messageMediaWidget.public_data_hash = j10;
                                        }
                                        yr a02 = yr.a0(i10);
                                        a02.a.c(new ra(a02, k0Var3.d, k0Var3.c, str == null ? "" : str, j10, (String) null));
                                        str = str;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.i3(m0Var2.f, m0Var2.d * 1000);
                    }
                });
                return;
            case 2:
                q0 q0Var = (q0) this.b;
                r0 r0Var = q0Var.f;
                synchronized (r0Var.b) {
                    try {
                        if (q0Var.c <= 0 && q0Var.d) {
                            q0Var.d = false;
                            q0Var.a = null;
                            if (r0Var.d == q0Var) {
                                r0Var.d = null;
                            }
                            r0Var.g.unbindService(q0Var);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                v0 v0Var = (v0) this.b;
                h1 h1Var = v0Var.f;
                if (h1Var != null) {
                    h1Var.d(v0Var.x);
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) this.b;
                Process.setThreadPriority(10);
                runnable.run();
                return;
        }
    }
}
