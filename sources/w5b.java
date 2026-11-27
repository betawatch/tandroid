// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class w5b {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static w5b a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        w5b w5bVar = new w5b();
        w5bVar.a = tL_storyAlbum.album_id;
        w5bVar.b = tL_storyAlbum.title;
        w5bVar.c = tL_storyAlbum.icon_photo;
        w5bVar.d = tL_storyAlbum.icon_video;
        return w5bVar;
    }
}
