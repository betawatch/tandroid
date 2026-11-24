// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ya0 extends fx0 {
    public final /* synthetic */ byte l1 = 1;
    public d m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(mb0 mb0Var, Activity activity) {
        super(activity, true);
        this.m1 = mb0Var;
    }

    @Override // fx0
    public final boolean D() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.D();
        }
    }

    public final void D0() {
        Activity parentActivity = ((cj3) this.m1).getParentActivity();
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

    @Override // fx0
    public final boolean E() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.E();
        }
    }

    @Override // fx0
    public final void I() {
        switch (this.l1) {
            case 0:
                super.I();
                mb0 mb0Var = (mb0) this.m1;
                gl.V2(mb0Var.getParentActivity(), mb0Var.getClassGuid());
                mb0Var.T = null;
                break;
            default:
                super.I();
                break;
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        switch (this.l1) {
            case 0:
                super.dismiss();
                mb0 mb0Var = (mb0) this.m1;
                mb0Var.K.z1(mb0Var.Z);
                mb0Var.f = true;
                mb0Var.fragmentView.invalidate();
                mb0Var.e.animate().setListener(new g0(this, (byte) 15)).alpha(0.0f).setDuration(200L).start();
                break;
            default:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
        }
    }

    public /* synthetic */ ya0(Context context, boolean z) {
        super(context, z);
    }
}
