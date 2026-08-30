package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ xe(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        xn xnVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                xn xnVar2 = this.b;
                xnVar2.d5 = messageSuggestionParams;
                xnVar2.m5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                xnVar2.yb(true, null, xnVar2.m5, null, null, null, false, true);
                break;
            case 1:
                xnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    xnVar.finishFragment();
                    break;
                }
                break;
            case 2:
                xnVar.da((String) obj, false);
                break;
            case 3:
                xnVar.Db((MessageSuggestionParams) obj);
                break;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = xnVar.O1;
                if (w21Var != null) {
                    w21Var.m(l10.longValue(), true);
                    break;
                }
                break;
            case 5:
                cs csVar = xnVar.a0;
                csVar.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = xn.Ec;
                xnVar.Ba(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = xn.Ec;
                xnVar.Ba(intValue2);
                break;
        }
    }
}
