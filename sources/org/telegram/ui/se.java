package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ se(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        rn rnVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                rn rnVar2 = this.b;
                rnVar2.c5 = messageSuggestionParams;
                rnVar2.l5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                rnVar2.yb(true, null, rnVar2.l5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                rnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    rnVar.finishFragment();
                    break;
                }
                break;
            case 2:
                rnVar.da((String) obj, false);
                break;
            case 3:
                rnVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.d21 d21Var = rnVar.N1;
                if (d21Var != null) {
                    d21Var.m(l10.longValue(), true);
                    break;
                }
                break;
            case 5:
                xr xrVar = rnVar.Z;
                xrVar.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = rn.Dc;
                rnVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = rn.Dc;
                rnVar.Ba(intValue2);
                break;
        }
    }
}
