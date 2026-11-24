// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z1b {
    public int a;
    public String b;
    public TLRPC.Photo c;
    public TLRPC.Document d;

    public static z1b a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        z1b z1bVar = new z1b();
        z1bVar.a = tL_storyAlbum.album_id;
        z1bVar.b = tL_storyAlbum.title;
        z1bVar.c = tL_storyAlbum.icon_photo;
        z1bVar.d = tL_storyAlbum.icon_video;
        return z1bVar;
    }
}
