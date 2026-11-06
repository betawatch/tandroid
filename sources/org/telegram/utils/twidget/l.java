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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        switch (this.a) {
            case 0:
                m mVar2 = (m) this.b;
                mVar2.getClass();
                p.a(mVar2);
                break;
            case 1:
                final o oVar = (o) this.b;
                int i7 = oVar.a;
                Iterator it = p.a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.b != i7 || mVar.l != oVar.b || mVar.k || mVar.x <= 0 || mVar.d <= 0) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar != null) {
                    TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                    tL_messages_getWidgetPublicData.peer = qp.s1(mVar.b).j1(mVar.c);
                    tL_messages_getWidgetPublicData.msg_id = mVar.d;
                    tL_messages_getWidgetPublicData.hash = oVar.c;
                    oVar.e = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getWidgetPublicData, new d3.b(1), new v10() { // from class: org.telegram.utils.twidget.j
                        @Override // org.telegram.messenger.v10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                            o oVar2 = o.this;
                            oVar2.e = 0;
                            HashMap hashMap = p.l;
                            StringBuilder sb2 = new StringBuilder();
                            int i10 = oVar2.a;
                            sb2.append(i10);
                            sb2.append("/");
                            long j3 = oVar2.b;
                            sb2.append(j3);
                            if (hashMap.get(sb2.toString()) != oVar2) {
                                return;
                            }
                            if (messages_widgetpublicdata != null) {
                                int i11 = messages_widgetpublicdata.period;
                                oVar2.d = i11 <= 0 ? 30 : Math.max(5, Math.min(3600, i11));
                                if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                                    TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                                    long j10 = tL_messages_widgetPublicData.hash;
                                    oVar2.c = j10;
                                    String str = tL_messages_widgetPublicData.data;
                                    String A = p.A(str);
                                    for (m mVar3 : p.a.values()) {
                                        if (mVar3.b == i10 && mVar3.l == j3 && !mVar3.k && (!TextUtils.equals(mVar3.p, A) || mVar3.q != j10)) {
                                            mVar3.q = j10;
                                            p.c(mVar3, mVar3.o, A);
                                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar3.r;
                                            if (tL_messageMediaWidget != null) {
                                                tL_messageMediaWidget.public_data_hash = j10;
                                            }
                                            yr a02 = yr.a0(i10);
                                            a02.a.c(new ra(a02, mVar3.d, mVar3.c, str == null ? "" : str, j10, (String) null));
                                            str = str;
                                        }
                                    }
                                }
                            }
                            org.telegram.messenger.g0.i3(oVar2.f, oVar2.d * 1000);
                        }
                    });
                    break;
                } else {
                    p.C();
                    break;
                }
            case 2:
                u uVar = (u) this.b;
                h0 h0Var = uVar.f;
                if (h0Var != null) {
                    h0Var.d(uVar.x);
                    break;
                }
                break;
            default:
                Runnable runnable = (Runnable) this.b;
                Process.setThreadPriority(10);
                runnable.run();
                break;
        }
    }
}
