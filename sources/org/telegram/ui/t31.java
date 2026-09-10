package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ t31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(eoVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.u31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                eoVar.Fa(messageObject);
                eoVar.Ha(messageObject);
                break;
            case 1:
                eo eoVar2 = this.b;
                org.telegram.ui.Components.wc a03 = org.telegram.ui.Components.wc.a0(eoVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.u31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                eoVar2.Fa(messageObject2);
                eoVar2.Ha(messageObject2);
                break;
            default:
                eo eoVar3 = this.b;
                org.telegram.ui.Components.wc a04 = org.telegram.ui.Components.wc.a0(eoVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.u31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                eoVar3.Fa(messageObject3);
                eoVar3.Ha(messageObject3);
                break;
        }
    }
}
