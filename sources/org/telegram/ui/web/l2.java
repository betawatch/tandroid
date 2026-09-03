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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l2 extends TLObject {
    public long a = System.currentTimeMillis();
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public Bitmap i;
    public byte[] j;

    public static l2 a(x0 x0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl(), true);
        l2Var.b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (x0Var.G) {
            l2Var.c = x0Var.H;
        }
        l2Var.d = x0Var.r;
        if (x0Var.s) {
            l2Var.e = x0Var.w;
        }
        if (x0Var.v) {
            l2Var.f = x0Var.x;
        }
        if (x0Var.J) {
            l2Var.i = x0Var.L;
        }
        return l2Var;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.a = inputSerializedData.readInt64(z4);
        this.b = inputSerializedData.readString(z4);
        this.c = inputSerializedData.readString(z4);
        this.d = inputSerializedData.readString(z4);
        this.e = inputSerializedData.readInt32(z4);
        this.f = inputSerializedData.readInt32(z4);
        if (inputSerializedData.readInt32(z4) == 1450380236) {
            this.i = null;
        } else {
            this.j = inputSerializedData.readByteArray(z4);
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
