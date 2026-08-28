package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ xx0(ProfileActivity profileActivity, int i9) {
        this.a = i9;
        this.b = profileActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.dv(profileActivity, profileActivity.getParentActivity(), profileActivity.v0, arrayList));
                break;
            default:
                ProfileActivity.d0(this.b, (Boolean) obj);
                break;
        }
    }
}
