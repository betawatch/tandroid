package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ se(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        qn qnVar = this.b;
        switch (i9) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                qn qnVar2 = this.b;
                qnVar2.c5 = messageSuggestionParams;
                qnVar2.l5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                qnVar2.yb(true, null, qnVar2.l5, null, null, null, false, true);
                break;
            case 1:
                qnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    qnVar.finishFragment();
                    break;
                }
                break;
            case 2:
                qnVar.da((String) obj, false);
                break;
            case 3:
                qnVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.b21 b21Var = qnVar.N1;
                if (b21Var != null) {
                    b21Var.m(l10.longValue(), true);
                    break;
                }
                break;
            case 5:
                wr wrVar = qnVar.Z;
                wrVar.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i10 = qn.Dc;
                qnVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = qn.Dc;
                qnVar.Ba(intValue2);
                break;
        }
    }
}
