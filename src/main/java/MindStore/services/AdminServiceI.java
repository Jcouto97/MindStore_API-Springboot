package MindStore.services;

import MindStore.command.personDto.AdminDto;
import MindStore.command.personDto.AdminUpdateDto;
import MindStore.command.personDto.UserDto;
import MindStore.command.personDto.UserUpdateDto;
import MindStore.command.productDto.ProductDto;
import MindStore.command.productDto.ProductUpdateDto;

import java.util.List;

public interface AdminServiceI {
    List<ProductDto> getAllProducts(String direction, String field, int page, int pageSize);

    List<ProductDto> getAllProductsByPrice(String direction, int page, int pageSize, int minPrice, int maxPrice);

    List<ProductDto> filterByRating(String direction, int page, int pageSize, int minRating, int maxRating);

    ProductDto getProductById(Long id);

    List<ProductDto> getProductsByName(String title);

    List<UserDto> getAllUsers(String direction, String field, int page, int pageSize);

    UserDto getUserById(Long id);

    List<UserDto> getUsersByName(String name);

    AdminDto addAdmin(AdminDto adminDto);

    ProductDto addProduct(ProductDto productDto);

    UserDto addUser(UserDto userDto);

    AdminDto updateAdmin(Long id, AdminUpdateDto adminUpdateDto);

    ProductDto updateProduct(Long id, ProductUpdateDto productUpdateDto);

    UserDto updateUser(Long id, UserUpdateDto userUpdateDto);

    void deleteProduct(Long id);

    void deleteProductByTitle(String title);
}
