package org.telegram.utils.twidget;

import android.content.Context;
import android.text.TextUtils;
import di.j9;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                tL_messages_getWidgetPublicData.peer = mp.u1(k0Var.b).l1(k0Var.c);
                tL_messages_getWidgetPublicData.msg_id = k0Var.d;
                tL_messages_getWidgetPublicData.hash = m0Var.c;
                m0Var.e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new p10() { // from class: org.telegram.utils.twidget.h0
                    @Override // org.telegram.messenger.p10
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
                                        tr a02 = tr.a0(i10);
                                        a02.a.c(new j9(a02, k0Var3.d, k0Var3.c, str == null ? "" : str, j10, (String) null));
                                        str = str;
                                    }
                                }
                            }
                        }
                        org.telegram.messenger.g0.h3(m0Var2.f, m0Var2.d * 1000);
                    }
                });
                return;
            case 2:
                y0 y0Var = (y0) this.b;
                synchronized (y0Var.y.e) {
                    try {
                        if (!y0Var.h && y0Var.d <= 0) {
                            if (y0Var.y.v() <= 1) {
                                z0 z0Var = y0Var.y;
                                if (z0Var.o && z0Var.p) {
                                }
                            }
                            y0Var.y.t(y0Var);
                            y0Var.y.y();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 3:
                d1 d1Var = (d1) this.b;
                p1 p1Var = d1Var.f;
                if (p1Var != null) {
                    p1Var.f(d1Var.x);
                    return;
                }
                return;
            default:
                p1.d((Context) this.b);
                return;
        }
    }
}
