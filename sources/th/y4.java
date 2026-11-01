package th;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y4 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static y4 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        y4 y4Var = new y4();
        y4Var.a = tL_storyAlbum.album_id;
        y4Var.b = tL_storyAlbum.title;
        y4Var.c = tL_storyAlbum.icon_photo;
        y4Var.d = tL_storyAlbum.icon_video;
        return y4Var;
    }
}
