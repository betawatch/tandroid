package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class su implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ su(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        yw ywVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ywVar.J2;
                if (ywVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z9 = !arrayList.isEmpty();
                    boolean z10 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z9 && longValue != ywVar.getUserConfig().e()) {
                            z9 = false;
                        }
                        if (org.telegram.messenger.m5.C(longValue)) {
                            z10 = false;
                        }
                        TLRPC.Chat M0 = ywVar.getMessagesController().M0(Long.valueOf(-longValue));
                        if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                            z10 = false;
                        }
                    }
                    boolean z11 = ywVar.m4() && ywVar.x3();
                    if (z11) {
                        ArrayList arrayList2 = ywVar.E2;
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
                    ArrayList arrayList3 = ywVar.E2;
                    boolean z12 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(ywVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.id.M0(z12 ? 2131745635 : 2131745636, null), new eu(ywVar, 5), z11);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new eu(ywVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(z9 ? 2131745514 : 2131745859, null), new org.telegram.ui.Components.up0(6, ywVar, z9), z10);
                    H.Z();
                    break;
                }
                break;
            case 1:
                yw ywVar2 = this.b;
                ywVar2.D4(ywVar2.J2, org.telegram.messenger.qs.p1, true, true, null);
                break;
            case 2:
                ywVar.B4(view);
                break;
            default:
                ywVar.getContactsController().B();
                ywVar.W4();
                break;
        }
        return true;
    }
}
