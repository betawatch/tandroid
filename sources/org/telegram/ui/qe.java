package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ qe(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        tn tnVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                tn tnVar2 = this.b;
                tnVar2.c5 = messageSuggestionParams;
                tnVar2.l5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                tnVar2.yb(true, null, tnVar2.l5, null, null, null, false, true);
                break;
            case 1:
                tnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    tnVar.finishFragment();
                    break;
                }
                break;
            case 2:
                tnVar.da((String) obj, false);
                break;
            case 3:
                tnVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.m21 m21Var = tnVar.N1;
                if (m21Var != null) {
                    m21Var.m(l10.longValue(), true);
                    break;
                }
                break;
            case 5:
                vr vrVar = tnVar.Z;
                vrVar.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = tn.Dc;
                tnVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = tn.Dc;
                tnVar.Ba(intValue2);
                break;
        }
    }
}
