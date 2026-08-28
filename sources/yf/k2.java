package yf;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k2 {
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
    public Utilities.Callback2 m;
    public Utilities.Callback n;
    public boolean o;
    public ArrayList p;
    public ArrayList q;
    public MessageObject r;
    public VideoEditedInfo s;
    public float t;
    public float u;

    public final void a() {
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = this.p;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            try {
                ((File) obj).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            try {
                ((File) obj2).delete();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10 = this.m == null ? 0.9f : 1.0f;
        if (this.s == null) {
            return f10 * this.u;
        }
        return e2.c.B(this.u, 0.5f, this.t * 0.5f, f10);
    }
}
