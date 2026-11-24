// default package

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yx6 implements ky6 {
    public final /* synthetic */ ly6 a;
    public final /* synthetic */ ks6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yx6(ly6 ly6Var, ks6 ks6Var, int i) {
        this.a = ly6Var;
        this.b = ks6Var;
        this.c = i;
    }

    @Override // ky6
    public final void a(sw6 sw6Var) {
        byte[] bArr;
        ks6 ks6Var = this.b;
        if (TextUtils.isEmpty(ks6Var.a)) {
            ncd.f("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i = j26.a;
        String str = ks6Var.a;
        qs6 qs6Var = new qs6();
        ts6 ts6Var = new ts6();
        List list = Collections.EMPTY_LIST;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        vs6 vs6Var = new vs6();
        ys6 ys6Var = ys6.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        in3 in3Var = new in3((byte) 16, false);
        in3Var.b = ks6Var.r;
        ys6 ys6Var2 = new ys6(in3Var);
        CharSequence charSequence = ks6Var.b;
        ht6 ht6Var = new ht6();
        ht6Var.f = ks6Var.c;
        ht6Var.g = ks6Var.d;
        ht6Var.n = ks6Var.h;
        ht6Var.i = j26.c(null);
        Bitmap bitmap = ks6Var.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (ks6Var.f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        ks6Var.f = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    ncd.g("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = ks6Var.f;
        }
        int i2 = 3;
        if (bArr != null) {
            ht6Var.b(bArr, 3);
        }
        Bundle bundle = ks6Var.n;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        boolean z = true;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j = bundle2.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j != 0) {
                if (j == 1) {
                    i2 = 1;
                } else if (j == 2) {
                    i2 = 2;
                } else if (j != 3) {
                    if (j == 4) {
                        i2 = 4;
                    } else if (j == 5) {
                        i2 = 5;
                    } else if (j == 6) {
                        i2 = 6;
                    }
                }
                ht6Var.q = Integer.valueOf(i2);
                bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i2 = 0;
            ht6Var.q = Integer.valueOf(i2);
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        ht6Var.r = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            ht6Var.I = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            ht6Var.K = mo5.q(mo5.q(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            ht6Var.a = charSequence;
        } else {
            ht6Var.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            ht6Var.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            ht6Var.J = bundle2;
        }
        ht6Var.s = Boolean.TRUE;
        jt6 jt6Var = new jt6(ht6Var);
        if (ts6Var.b != null && ts6Var.a == null) {
            z = false;
        }
        jte.p(z);
        bt6 bt6Var = new bt6(str2, new ss6(qs6Var), null, new ws6(vs6Var), jt6Var, ys6Var2);
        ly6 ly6Var = this.a;
        t76 k = ly6Var.j.k(sw6Var, mo5.u(bt6Var));
        k.b(new us4(k, new kq(ly6Var, sw6Var, this.c), (byte) 0), new rf2(ly6Var, (byte) 4));
    }
}
