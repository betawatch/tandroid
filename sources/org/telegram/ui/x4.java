package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x4 {
    public final ImageLocation a;
    public final ImageLocation b;
    public final ImageLocation c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final d5[] i;
    public final z4 j;

    public x4(ImageLocation imageLocation, ImageLocation imageLocation2, ImageLocation imageLocation3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, d5[] d5VarArr, z4 z4Var) {
        this.a = imageLocation;
        this.b = imageLocation2;
        this.c = imageLocation3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = d5VarArr;
        this.j = z4Var;
    }

    public static x4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, d5... d5VarArr) {
        ImageLocation imageLocation;
        String str;
        TLRPC.ChatPhoto chatPhoto;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
        String str2 = null;
        String str3 = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            imageLocation = null;
            str = null;
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(chatFull.chat_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            imageLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize, chatFull.chat_photo);
            str = FileLoader.getAttachFileName(closestVideoSizeWithSize);
        }
        if (imageLocation != null && imageLocation.imageType == 2) {
            str2 = ImageLoader.AUTOPLAY_FILTER;
        }
        return new x4(forUserOrChat, forUserOrChat2, imageLocation, str3, str2, str, bitmapDrawable, chat, d5VarArr, null);
    }

    public static x4 b(TLRPC.User user, int i10, d5... d5VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(user, 0);
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(user, 1);
        BitmapDrawable bitmapDrawable = null;
        String str = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new x4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, user, d5VarArr, new e5(i10, user, NotificationCenter.userInfoDidLoad));
    }

    public static x4 c(TLRPC.User user, TLRPC.UserFull userFull, d5... d5VarArr) {
        ImageLocation imageLocation;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(userFull.user, 0);
        if (forUserOrChat == null && (photo = userFull.profile_photo) != null) {
            forUserOrChat = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 500), userFull.profile_photo);
        }
        ImageLocation imageLocation2 = forUserOrChat;
        ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(userFull.user, 1);
        String str2 = null;
        String str3 = (forUserOrChat2 == null || !(forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            imageLocation = null;
            str = null;
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(userFull.profile_photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            ImageLocation forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, userFull.profile_photo);
            str = FileLoader.getAttachFileName(closestVideoSizeWithSize);
            imageLocation = forPhoto;
        }
        if (imageLocation != null && imageLocation.imageType == 2) {
            str2 = ImageLoader.AUTOPLAY_FILTER;
        }
        return new x4(imageLocation2, forUserOrChat2, imageLocation, str3, str2, str, bitmapDrawable, userFull.user, d5VarArr, null);
    }
}
