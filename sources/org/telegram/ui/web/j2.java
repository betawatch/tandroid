package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j2 extends TLObject {
    public long a = System.currentTimeMillis();
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public Bitmap i;
    public byte[] j;

    public static j2 a(w0 w0Var) {
        j2 j2Var = new j2();
        String hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl(), true);
        j2Var.b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (w0Var.F) {
            j2Var.c = w0Var.G;
        }
        j2Var.d = w0Var.r;
        if (w0Var.s) {
            j2Var.e = w0Var.w;
        }
        if (w0Var.v) {
            j2Var.f = w0Var.x;
        }
        if (w0Var.I) {
            j2Var.i = w0Var.K;
        }
        return j2Var;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.a = inputSerializedData.readInt64(z10);
        this.b = inputSerializedData.readString(z10);
        this.c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.i = null;
        } else {
            this.j = inputSerializedData.readByteArray(z10);
            this.i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.j));
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.a);
        String str = this.b;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str2 = this.c;
        if (str2 == null) {
            str2 = "";
        }
        outputSerializedData.writeString(str2);
        String str3 = this.d;
        outputSerializedData.writeString(str3 != null ? str3 : "");
        outputSerializedData.writeInt32(this.e);
        outputSerializedData.writeInt32(this.f);
        if (this.i == null) {
            outputSerializedData.writeInt32(TLRPC.TL_null.constructor);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
