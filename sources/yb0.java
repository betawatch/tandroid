// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yb0 extends my0 {
    public final /* synthetic */ byte l1 = 1;
    public d m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb0(mc0 mc0Var, Activity activity) {
        super(activity, true);
        this.m1 = mc0Var;
    }

    @Override // my0
    public final boolean C() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.C();
        }
    }

    public final void D0() {
        Activity parentActivity = ((nk3) this.m1).getParentActivity();
        boolean z = false;
        boolean z2 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        int i = Build.VERSION.SDK_INT;
        if ((i >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z = true;
        }
        if (z && z2) {
            boolean z3 = FilesMigrationService.c;
            a.b.startService(new Intent(a.b, (Class<?>) FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            if (i >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z2) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override // my0
    public final boolean E() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.E();
        }
    }

    @Override // my0
    public final void H() {
        switch (this.l1) {
            case 0:
                super.H();
                mc0 mc0Var = (mc0) this.m1;
                gm.V2(mc0Var.getParentActivity(), mc0Var.getClassGuid());
                mc0Var.T = null;
                break;
            default:
                super.H();
                break;
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        switch (this.l1) {
            case 0:
                super.dismiss();
                mc0 mc0Var = (mc0) this.m1;
                mc0Var.K.z1(mc0Var.Z);
                mc0Var.f = true;
                mc0Var.fragmentView.invalidate();
                mc0Var.e.animate().setListener(new g0(this, (byte) 17)).alpha(0.0f).setDuration(200L).start();
                break;
            default:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
        }
    }

    public /* synthetic */ yb0(Context context, boolean z) {
        super(context, z);
    }
}
