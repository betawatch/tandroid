package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ u31(fo foVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = activity;
        this.d = c6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.v31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                foVar.Ja(messageObject);
                foVar.La(messageObject);
                break;
            case 1:
                fo foVar2 = this.b;
                org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(foVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.v31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                foVar2.Ja(messageObject2);
                foVar2.La(messageObject2);
                break;
            default:
                fo foVar3 = this.b;
                org.telegram.ui.Components.zc a04 = org.telegram.ui.Components.zc.a0(foVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.v31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                foVar3.Ja(messageObject3);
                foVar3.La(messageObject3);
                break;
        }
    }
}
