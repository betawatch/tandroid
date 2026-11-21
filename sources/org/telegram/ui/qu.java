package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ qu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        cx cxVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = cxVar.K2;
                if (cxVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != cxVar.getUserConfig().e()) {
                            z10 = false;
                        }
                        if (org.telegram.messenger.n5.C(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat O0 = cxVar.getMessagesController().O0(Long.valueOf(-longValue));
                        if (O0 != null && !org.telegram.messenger.v3.B(O0)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = cxVar.o4() && cxVar.x3();
                    if (z12) {
                        ArrayList arrayList2 = cxVar.F2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (((org.telegram.messenger.ef) obj).b()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = cxVar.F2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(cxVar, view);
                    I.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(z13 ? 2131745439 : 2131745440, null), new gu(cxVar, 13), z12);
                    I.c(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new gu(cxVar, 14), false);
                    I.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(z10 ? 2131745318 : 2131745663, null), new org.telegram.ui.Components.rp0(7, cxVar, z10), z11);
                    I.a0();
                    break;
                }
                break;
            case 1:
                cx cxVar2 = this.b;
                cxVar2.K4(cxVar2.K2, org.telegram.messenger.ks.p1, true, true, null);
                break;
            case 2:
                cxVar.G4(view);
                break;
            default:
                cxVar.getContactsController().B();
                cxVar.e5();
                break;
        }
        return true;
    }
}
