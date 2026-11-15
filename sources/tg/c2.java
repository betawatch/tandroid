package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c2 {
    public String a;
    public String b;
    public String c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f;
    public TLRPC.InputFile g;
    public boolean h;
    public long i;
    public TLRPC.StickerSet j;
    public TLRPC.Document k;
    public String l;
    public s10 m;
    public z10 n;
    public boolean o;
    public ArrayList p;
    public ArrayList q;
    public gj r;
    public g20 s;
    public float t;
    public float u;

    public final void a() {
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = this.p;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            try {
                ((File) obj).delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            try {
                ((File) obj2).delete();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10 = this.m == null ? 0.9f : 1.0f;
        if (this.s == null) {
            return f10 * this.u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.u, 0.5f, this.t * 0.5f, f10);
    }
}
