package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ tb1(ThemeActivity themeActivity, int i10) {
        this.a = i10;
        this.b = themeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ThemeActivity themeActivity = this.b;
                themeActivity.b.e1(new ob1(themeActivity, 0), 700, true);
                break;
            default:
                ThemeActivity themeActivity2 = this.b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.i6.x, org.telegram.ui.ActionBar.i6.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new pb1(0, themeActivity2, str));
                break;
        }
    }
}
