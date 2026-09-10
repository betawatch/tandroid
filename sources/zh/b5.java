package zh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b5 {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static b5 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        b5 b5Var = new b5();
        b5Var.a = tL_storyAlbum.album_id;
        b5Var.b = tL_storyAlbum.title;
        b5Var.c = tL_storyAlbum.icon_photo;
        b5Var.d = tL_storyAlbum.icon_video;
        return b5Var;
    }
}
