package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z81 implements View.OnClickListener {
    public final /* synthetic */ Context a;

    public z81(Activity activity) {
        this.a = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        af.g.s(this.a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
