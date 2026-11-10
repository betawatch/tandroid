package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ tu(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        zw zwVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = zwVar.J2;
                if (zwVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z9 = !arrayList.isEmpty();
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z9 && longValue != zwVar.getUserConfig().e()) {
                            z9 = false;
                        }
                        if (org.telegram.messenger.m5.C(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat M0 = zwVar.getMessagesController().M0(Long.valueOf(-longValue));
                        if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                            z10 = false;
                        }
                    }
                    boolean z11 = zwVar.m4() && zwVar.x3();
                    if (z11) {
                        ArrayList arrayList2 = zwVar.E2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (((org.telegram.messenger.gf) obj).b()) {
                                    z11 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = zwVar.E2;
                    boolean z12 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(zwVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z12 ? 2131745635 : 2131745636, null), new fu(zwVar, 5), z11);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new fu(zwVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(z9 ? 2131745514 : 2131745859, null), new org.telegram.ui.Components.tp0(6, zwVar, z9), z10);
                    H.Z();
                    break;
                }
                break;
            case 1:
                zw zwVar2 = this.b;
                zwVar2.D4(zwVar2.J2, org.telegram.messenger.qs.p1, true, true, null);
                break;
            case 2:
                zwVar.B4(view);
                break;
            default:
                zwVar.getContactsController().B();
                zwVar.W4();
                break;
        }
        return true;
    }
}
