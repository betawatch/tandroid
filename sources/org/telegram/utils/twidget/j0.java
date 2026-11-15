package org.telegram.utils.twidget;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import di.f9;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                tL_messages_getWidgetPublicData.peer = np.s1(k0Var.b).j1(k0Var.c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.c;
                m0Var.e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new s10() { // from class: org.telegram.utils.twidget.h0
                    @Override // org.telegram.messenger.s10
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
                                        vr a02 = vr.a0(i10);
                                        a02.a.c(new f9(a02, k0Var3.d, k0Var3.c, str == null ? "" : str, j10, (String) null));
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
                t0 t0Var = (t0) this.b;
                u0 u0Var = t0Var.h;
                synchronized (u0Var.b) {
                    try {
                        if (t0Var.c <= 0 && t0Var.d) {
                            t0Var.d = false;
                            t0Var.a = null;
                            if (u0Var.d == t0Var) {
                                u0Var.d = null;
                            }
                            u0Var.g.unbindService(t0Var);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                y0 y0Var = (y0) this.b;
                l1 l1Var = y0Var.f;
                if (l1Var != null) {
                    l1Var.e(y0Var.x);
                    return;
                }
                return;
            case 4:
                Runnable runnable = (Runnable) this.b;
                Process.setThreadPriority(10);
                runnable.run();
                return;
            default:
                l1.c((Context) this.b);
                return;
        }
    }
}
