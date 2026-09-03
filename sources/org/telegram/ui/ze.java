package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ze(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                zn znVar2 = this.b;
                znVar2.d5 = messageSuggestionParams;
                znVar2.m5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                znVar2.yb(true, null, znVar2.m5, null, null, null, false, true);
                break;
            case 1:
                znVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    znVar.finishFragment();
                    break;
                }
                break;
            case 2:
                znVar.da((String) obj, false);
                break;
            case 3:
                znVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = znVar.O1;
                if (w21Var != null) {
                    w21Var.m(l10.longValue(), true);
                    break;
                }
                break;
            case 5:
                es esVar = znVar.a0;
                esVar.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = zn.Ec;
                znVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = zn.Ec;
                znVar.Ba(intValue2);
                break;
        }
    }
}
