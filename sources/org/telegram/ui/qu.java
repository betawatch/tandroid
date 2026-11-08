package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ qu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        ww wwVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = wwVar.I2;
                if (wwVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z9 = !arrayList.isEmpty();
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z9 && longValue != wwVar.getUserConfig().e()) {
                            z9 = false;
                        }
                        if (org.telegram.messenger.m5.C(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat M0 = wwVar.getMessagesController().M0(Long.valueOf(-longValue));
                        if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                            z10 = false;
                        }
                    }
                    boolean z11 = wwVar.m4() && wwVar.x3();
                    if (z11) {
                        ArrayList arrayList2 = wwVar.D2;
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
                    ArrayList arrayList3 = wwVar.D2;
                    boolean z12 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(wwVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z12 ? 2131745638 : 2131745639, null), new cu(wwVar, 5), z11);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745586, null), new cu(wwVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(z9 ? 2131745517 : 2131745862, null), new org.telegram.ui.Components.tp0(6, wwVar, z9), z10);
                    H.Z();
                    break;
                }
                break;
            case 1:
                ww wwVar2 = this.b;
                wwVar2.D4(wwVar2.I2, org.telegram.messenger.qs.p1, true, true, null);
                break;
            case 2:
                wwVar.B4(view);
                break;
            default:
                wwVar.getContactsController().B();
                wwVar.W4();
                break;
        }
        return true;
    }
}
