// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class v5b {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static v5b a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        v5b v5bVar = new v5b();
        v5bVar.a = tL_storyAlbum.album_id;
        v5bVar.b = tL_storyAlbum.title;
        v5bVar.c = tL_storyAlbum.icon_photo;
        v5bVar.d = tL_storyAlbum.icon_video;
        return v5bVar;
    }
}
