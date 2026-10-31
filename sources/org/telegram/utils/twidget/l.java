package org.telegram.utils.twidget;

import android.os.Process;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.mn;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
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
                int i10 = oVar.a;
                Iterator it = p.a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.b != i10 || mVar.l != oVar.b || mVar.k || mVar.y <= 0 || mVar.d <= 0) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar != null) {
                    TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                    tL_messages_getWidgetPublicData.peer = vp.r1(mVar.b).i1(mVar.c);
                    tL_messages_getWidgetPublicData.msg_id = mVar.d;
                    tL_messages_getWidgetPublicData.hash = oVar.c;
                    oVar.e = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_getWidgetPublicData, new a3.b(1), new j20() { // from class: org.telegram.utils.twidget.j
                        @Override // org.telegram.messenger.j20
                        public final void a(Object obj, Object obj2) {
                            TLRPC.messages_WidgetPublicData messages_widgetpublicdata = (TLRPC.messages_WidgetPublicData) obj;
                            o oVar2 = o.this;
                            oVar2.e = 0;
                            HashMap hashMap = p.l;
                            StringBuilder sb2 = new StringBuilder();
                            int i11 = oVar2.a;
                            sb2.append(i11);
                            sb2.append("/");
                            long j10 = oVar2.b;
                            sb2.append(j10);
                            if (hashMap.get(sb2.toString()) != oVar2) {
                                return;
                            }
                            if (messages_widgetpublicdata != null) {
                                int i12 = messages_widgetpublicdata.period;
                                oVar2.d = i12 <= 0 ? 30 : Math.max(5, Math.min(3600, i12));
                                if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                                    TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                                    long j11 = tL_messages_widgetPublicData.hash;
                                    oVar2.c = j11;
                                    String str = tL_messages_widgetPublicData.data;
                                    String A = p.A(str);
                                    for (m mVar3 : p.a.values()) {
                                        if (mVar3.b == i11 && mVar3.l == j10 && !mVar3.k && (!TextUtils.equals(mVar3.q, A) || mVar3.r != j11)) {
                                            mVar3.r = j11;
                                            p.c(mVar3, mVar3.p, A);
                                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar3.s;
                                            if (tL_messageMediaWidget != null) {
                                                tL_messageMediaWidget.public_data_hash = j11;
                                            }
                                            hs a02 = hs.a0(i11);
                                            a02.a.c(new mn(a02, mVar3.d, mVar3.c, str == null ? "" : str, j11, (String) null));
                                            str = str;
                                        }
                                    }
                                }
                            }
                            org.telegram.messenger.i0.h3(oVar2.f, oVar2.d * 1000);
                        }
                    });
                    break;
                } else {
                    p.C();
                    break;
                }
            case 2:
                w wVar = (w) this.b;
                k0 k0Var = wVar.f;
                if (k0Var != null) {
                    k0Var.c(wVar.x);
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
