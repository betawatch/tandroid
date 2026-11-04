package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ ws(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i3) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i3 != 0) {
            i10 = 3;
            if (i3 != 1) {
                i10 = i3 != 2 ? i3 != 3 ? -1 : 2 : 1;
            }
        } else {
            i10 = 0;
        }
        if (i10 != -1) {
            this.b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.V = true;
        }
        n4 n4Var = dataSettingsActivity.a;
        if (n4Var != null) {
            n4Var.g(this.c);
        }
    }
}
