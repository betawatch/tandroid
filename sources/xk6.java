// default package

import java.io.File;
import java.util.Set;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ u47 h;
    public final /* synthetic */ k27 n;
    public final /* synthetic */ k27 r;
    public final /* synthetic */ TL_stories.StoryItem s;
    public final /* synthetic */ Object w;

    public /* synthetic */ xk6(MediaController mediaController, int i, int i2, long j, long j2, u47 u47Var, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, j1a j1aVar) {
        this.b = mediaController;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = u47Var;
        this.n = k27Var;
        this.r = k27Var2;
        this.s = storyItem;
        this.w = j1aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String absolutePath;
        byte b = this.a;
        Object obj = this.w;
        switch (b) {
            case 0:
                cq6 cq6Var = (cq6) obj;
                long j = this.e;
                long j2 = this.f;
                u47 u47Var = this.h;
                k27 k27Var = this.r;
                TL_stories.StoryItem storyItem = this.s;
                MediaController.i0(true);
                MediaController mediaController = this.b;
                mediaController.C1 = (byte) 0;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                mediaController.g1 = tL_document;
                mediaController.h1 = this.c;
                tL_document.dc_id = TLObject.FLAG_31;
                tL_document.id = cq6Var.e;
                int i = this.d;
                tL_document.user_id = y6c.h(i).e();
                TLRPC.TL_document tL_document2 = mediaController.g1;
                tL_document2.mime_type = "audio/ogg";
                tL_document2.file_reference = new byte[0];
                gba.x();
                mediaController.k1 = new nl6(cq6Var.a);
                ba4.z(4).mkdirs();
                File file = mediaController.k1;
                Set set = s60.a;
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    s60.a.add(absolutePath);
                }
                try {
                    mediaController.e1 = true;
                    mediaController.l1 = cq6Var.d;
                    mediaController.m1 = cq6Var.c;
                    mediaController.w1 = cq6Var.b;
                    mediaController.v1 = cq6Var.f;
                    mediaController.n1 = j;
                    mediaController.p1 = j2;
                    mediaController.q1 = u47Var;
                    k27 k27Var2 = this.n;
                    mediaController.o1 = k27Var2 == null ? 0L : k27.b2(mediaController.i1, k27Var2.k, false, false);
                    mediaController.i1 = i;
                    mediaController.r1 = k27Var;
                    mediaController.s1 = k27Var2;
                    mediaController.t1 = storyItem;
                    mediaController.u1 = mediaController.u1;
                    TLRPC.TL_document tL_document3 = mediaController.g1;
                    File file2 = mediaController.k1;
                    gl.d3(new vz4((Object) mediaController, (Object) file2, (Object) tL_document3, (Object) (file2.exists() ? MediaController.getWaveform(file2.getAbsolutePath()) : null), (Object) cq6Var, (byte) 19));
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    mediaController.g1 = null;
                    s60.b(mediaController.k1);
                    mediaController.k1.delete();
                    mediaController.k1 = null;
                    try {
                        mediaController.f1.release();
                        mediaController.f1 = null;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    MediaController.i0(false);
                    gl.d3(new va2((Object) mediaController, i, j, (byte) 2));
                    return;
                }
            default:
                String[] strArr = MediaController.W1;
                this.b.J(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, (j1a) obj);
                break;
        }
    }

    public /* synthetic */ xk6(MediaController mediaController, int i, cq6 cq6Var, int i2, long j, long j2, u47 u47Var, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem) {
        this.b = mediaController;
        this.c = i;
        this.w = cq6Var;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.h = u47Var;
        this.n = k27Var;
        this.r = k27Var2;
        this.s = storyItem;
    }
}
