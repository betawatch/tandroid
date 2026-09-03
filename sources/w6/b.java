package w6;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import j7.h5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a8.j(19), new com.google.android.gms.common.api.d());
    public final String k;

    public b(Context context, l5.h hVar) {
        super(context, l, hVar, com.google.android.gms.common.api.i.c);
        this.k = e.a();
    }

    public final l5.g f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new com.google.android.gms.common.api.f(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : h5.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.r);
        }
        if (!status2.e()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<l5.g> creator2 = l5.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        l5.g gVar = (l5.g) (byteArrayExtra2 != null ? h5.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
